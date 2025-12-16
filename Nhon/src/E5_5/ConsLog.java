package E5_5;

public class ConsLog implements ILog {
	//properties
	private Entry first;
	private ILog rest;
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public ConsLog(Entry first, ILog rest) {
		this.first = first;
		this.rest = rest;
	}
	//total distance
	@Override
	public double total_in_sameMonth_year(int mon, int year) {
		return this.first.total_in_sameMonth_year(mon,year) + this.rest.total_in_sameMonth_year(mon,year);
	}
	
	//maximum distance ever ran
	@Override
	public double maxDis() {
		return Math.max(this.first.getDis(),this.rest.maxDis());
	}
	@Override
	public ILog sortBySpeedDES() {
		return this.rest.sortBySpeedDES().insByDistanceOrder(this.first);
	}
	@Override
	public ILog insByDistanceOrder(Entry e) {
		if(this.first.Faster(e)){
			return new ConsLog(this.first, this.rest.insByDistanceOrder(e));
		}
		return new ConsLog(e,this);
	}
	
	@Override
	public String toString() {
		return this.first.toString() + "\n"+ this.rest.toString();
	}
}
