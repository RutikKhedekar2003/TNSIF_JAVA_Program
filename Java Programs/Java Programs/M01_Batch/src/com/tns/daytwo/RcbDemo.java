package com.tns.daytwo;

//Encapsulation - Demo

public class RcbDemo {

	//variable
	String playerName;
	int age;
	int jersyNo;
	
	
	//Methods - Getters and Setters
	
	public String getPlayerName()
	{
		return playerName;
	}
	
	
	public void setPlayerName(String playerName)
	{
		this.playerName = playerName;
	}
	
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getJersyNo()
	{
		return jersyNo;
	}
	
	public void setJersyNo(int jersyNo) 
	{
		this.jersyNo =  jersyNo;
	}
	
	//toString() --> to represent the data in string 
	
	public String toString()
	{
		return "RcbDemo [Player Name = " + playerName +",Age = "+ age +", Jersy No = "+ jersyNo +"]";
	}
	
}
