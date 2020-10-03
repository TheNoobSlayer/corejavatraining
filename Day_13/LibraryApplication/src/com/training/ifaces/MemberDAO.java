package com.training.ifaces;

import java.util.ArrayList;

public interface MemberDAO<Member> extends DAO<Member> {
	
	public ArrayList<Member> getPenaltyList();
}
