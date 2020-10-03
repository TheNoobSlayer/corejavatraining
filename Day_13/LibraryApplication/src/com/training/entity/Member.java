package com.training.entity;
import java.time.LocalDate;
public class Member {
	private long memberId;
	private String memberName;
	private LocalDate accountOpeningDate;
	private String membershipType;
	private double feesPaid;
	private int maxBookAllowed;
	private double penaltyAmount;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(long memberId, String memberName, LocalDate accountOpeningDate, String membershipType,
			double feesPaid, int maxBookAllowed, double penaltyAmount) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.accountOpeningDate = accountOpeningDate;
		this.membershipType = membershipType;
		this.feesPaid = feesPaid;
		this.maxBookAllowed = maxBookAllowed;
		this.penaltyAmount = penaltyAmount;
	}
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public LocalDate getAccountOpeningDate() {
		return accountOpeningDate;
	}
	public void setAccountOpeningDate(LocalDate accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}
	public String getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getMaxBookAllowed() {
		return maxBookAllowed;
	}
	public void setMaxBookAllowed(int maxBookAllowed) {
		this.maxBookAllowed = maxBookAllowed;
	}
	public double getPenaltyAmount() {
		return penaltyAmount;
	}
	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountOpeningDate == null) ? 0 : accountOpeningDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(feesPaid);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + maxBookAllowed;
		result = prime * result + (int) (memberId ^ (memberId >>> 32));
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((membershipType == null) ? 0 : membershipType.hashCode());
		temp = Double.doubleToLongBits(penaltyAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Member other = (Member) obj;
		if (accountOpeningDate == null) {
			if (other.accountOpeningDate != null)
				return false;
		} else if (!accountOpeningDate.equals(other.accountOpeningDate))
			return false;
		if (Double.doubleToLongBits(feesPaid) != Double.doubleToLongBits(other.feesPaid))
			return false;
		if (maxBookAllowed != other.maxBookAllowed)
			return false;
		if (memberId != other.memberId)
			return false;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (membershipType == null) {
			if (other.membershipType != null)
				return false;
		} else if (!membershipType.equals(other.membershipType))
			return false;
		if (Double.doubleToLongBits(penaltyAmount) != Double.doubleToLongBits(other.penaltyAmount))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", accountOpeningDate="
				+ accountOpeningDate + ", membershipType=" + membershipType + ", feesPaid=" + feesPaid
				+ ", maxBookAllowed=" + maxBookAllowed + ", penaltyAmount=" + penaltyAmount + "]";
	}
	
}
