package com.juaracodingmaven.sqa.function;

public class function {
//compare string
	
	public String combineDuaKalimat(String a, String b) {
		return a + b;
	}
	
//compare nilai
	
	public int penjumlahan (int a,int b) {
		return a+b;
	}
//compareboolean
	
	public boolean cekBolehMenikah(int umur) {
		if(umur >17) {
			return true;
		}else {
			return false;
		}
	}
//compareNull
	public String ambilNamaTengah(String a) {
		
		String nama[]=a.split(" ");
		return nama[1];
		
	}
//compare tidak null
//compare object
	public boolean cekObjectisSame (Object a, Object b) {
		if (a.equals(b)) {
			return true;
		}else {
			return false;
		}
	}
}
