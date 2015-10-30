/**
 * 
 */
package org.herb.simplespring.example.model;

/**
 * @author herb
 *
 */
public class Address {
	private int doorNumber = 0;
	private String firstLine = null;
	private String secondLine = null;
	private String zipCode = null;
	private String provinceState = null;
	private String city = null;

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getProvinceState() {
		return provinceState;
	}

	public void setProvinceState(String provinceState) {
		this.provinceState = provinceState;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + doorNumber;
		result = prime * result + ((firstLine == null) ? 0 : firstLine.hashCode());
		result = prime * result + ((provinceState == null) ? 0 : provinceState.hashCode());
		result = prime * result + ((secondLine == null) ? 0 : secondLine.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (doorNumber != other.doorNumber)
			return false;
		if (firstLine == null) {
			if (other.firstLine != null)
				return false;
		} else if (!firstLine.equals(other.firstLine))
			return false;
		if (provinceState == null) {
			if (other.provinceState != null)
				return false;
		} else if (!provinceState.equals(other.provinceState))
			return false;
		if (secondLine == null) {
			if (other.secondLine != null)
				return false;
		} else if (!secondLine.equals(other.secondLine))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", firstLine=" + firstLine + ", secondLine=" + secondLine
				+ ", zipCode=" + zipCode + ", provinceState=" + provinceState + ", city=" + city + "]";
	}

}
