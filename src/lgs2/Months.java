package lgs2;

public enum Months {
	
	/* 12 months, February has 28 days,  leap years are ignored  */
	
	JANUARY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER), MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING), MAY(31, Seasons.SPRING),
	JUNE(30, Seasons.SUMMER), JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER), SEPTEMBER(30, Seasons.FALL), OCTOVBER(31, Seasons.FALL), 
	NOVEMBER(30, Seasons.FALL), DECEMBER(31, Seasons.WINTER);
	
	private int days;
	private Seasons seasons;
	private Months(int days, Seasons seasons) {
		this.days = days;
		this.seasons = seasons;
	}
	
	public int getDays() {
		return days;
	}
	public Seasons getSeasons() {
		return seasons;
	}

}
