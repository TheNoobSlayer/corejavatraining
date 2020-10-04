package com.training.utils;

import java.util.Comparator;

import com.training.entity.Member;

public class PenaltyComparator implements Comparator<Member> {

	@Override
	public int compare(Member object1, Member object2) {
		if(object1.getPenaltyAmount() < object2.getPenaltyAmount()) return -1;
		if(object1.getPenaltyAmount() > object2.getPenaltyAmount()) return 1;
		return 0;
	}

}
