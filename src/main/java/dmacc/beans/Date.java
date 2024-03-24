package dmacc.beans;

import jakarta.persistence.Embeddable;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Mar 24, 2024  
*/
@Embeddable
public class Date {
	String day;
	String month;
	String year;
	
	
	/**
	 * 
	 */
	public Date() {
		super();
	}

	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(String day, String month, String year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/**
	 * @return the day
	 */
	public String getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
}
