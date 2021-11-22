package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainExceptions;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation() {

	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainExceptions {
		if (!checkout.after(checkin)) {
			throw new DomainExceptions("Error in reservation: Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void updateDates(Date checkin, Date checkout) throws DomainExceptions {
		Date now = new Date();
		if (checkin.before(now) || checkout.before(now)) {
			throw new DomainExceptions("Error in reservation: Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainExceptions("Error in reservation: Check-out date must be after check-in date");
		}
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	@Override
	public String toString() {
		return String.format("Reservation: Room %d, check-in: %s, check-out: %s, %d nights", roomNumber,
				sdf.format(checkIn), sdf.format(checkOut), duration());
	}
}
