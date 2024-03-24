package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**  
* Ezra DeCleene - ecdecleene  
* CIS171 22149
* Mar 24, 2024  
*/
@Entity
public class Event {
	@Id
	@GeneratedValue
	private long id;
	String eventName;
	String organizerName;
	double eventCost;
	@Autowired
	Date date;
	
	/**
	 * @param eventName
	 * @param organizerName
	 * @param eventCost
	 */
	public Event(String eventName, String organizerName, double eventCost) {
		super();
		this.eventName = eventName;
		this.organizerName = organizerName;
		this.eventCost = eventCost;
	}

	/**
	 * @param eventName
	 * @param organizerName
	 * @param eventCost
	 * @param date
	 */
	public Event(String eventName, String organizerName, double eventCost, Date date) {
		super();
		this.eventName = eventName;
		this.organizerName = organizerName;
		this.eventCost = eventCost;
		this.date = date;
	}

	/**
	 * @param id
	 * @param eventName
	 * @param organizerName
	 * @param eventCost
	 * @param date
	 */
	public Event(long id, String eventName, String organizerName, double eventCost, Date date) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.organizerName = organizerName;
		this.eventCost = eventCost;
		this.date = date;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * 
	 */
	public Event() {
		super();
	}
	
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the organizerName
	 */
	public String getOrganizerName() {
		return organizerName;
	}
	/**
	 * @param organizerName the organizerName to set
	 */
	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}
	/**
	 * @return the eventCost
	 */
	public double getEventCost() {
		return eventCost;
	}
	/**
	 * @param eventCost the eventCost to set
	 */
	public void setEventCost(double eventCost) {
		this.eventCost = eventCost;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Event [id = " + id + ", eventname = " + eventName + ", organizername = " + organizerName + ", eventcost = " + eventCost + ", date = " + date + "]";
	}
}
