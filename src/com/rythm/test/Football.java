package com.rythm.test;

//�ļ���: Football.java
public interface Football extends Sports {
	public void homeTeamScored(int points);

	public void visitingTeamScored(int points);

	public void endOfQuarter(int quarter);
}
