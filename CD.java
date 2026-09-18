package cd_tuan5;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	
	// ---- Hang so mac dinh ----- //
	public static final int MA_CD_MAC_DINH = 999999;
	public static final String TUA_CD_MAC_DINH - "chua xac dinh";
	
	// --- constructor mac dinh --- //
	public CD() {
		this.maCD = MA_CD_MAC_DINH;
		this.tuaCD = TUA_CD_MAC_DINH;
		this.soBaiHat = 1;
		this.giaThanh = 1.0;
	}
	// ----- constructor co tham so ------//
	public CD(int maCD,String tuaCD,int soBaiHat,double giaThanh) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}
	
	// ------Getter------
	public int getMaCD() {return maCD;}
	public String getTuaCD() {return tuaCD;}
	public int getSoBaiHat() {return soBaiHat;}
	public double getGiaThanh() {return giaThanh;}
	
	
	// ------- Setter co kiem tra rang buoc --------
	public void setMaCD(int maCD) {
		if (maCD <= 0)
			throw new IllegalArgumentException("Loi:Ma CD phai > 0!");
		this.maCD=maCD;
	}
	public void setTuaCD(String tuaCD) {
		if(tuaCD == NULL || tuaCD.trim().isEmpty())
			throw new IllegalArgumentException("Loi:Tua CD khong duoc rong");
		this.tuaCD=tuaCD;
	}
	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat <= 0)
			throw new IllegalArgumentException("Loi:So Bai Hat phai > 0!");
		this.soBaiHat = soBaiHat;
	}
	public void setGiaThanh(double giaThanh) {
		if(giaThanh <= 0)
			throw new IllegalArgumentException("Loi:Gia thanh phai >0!");
		this.giaThanh= giaThanh;
	}
	
	// ---------toString dinh dang bang ----------------
	@Override
	public String toString() {
		return String.format(
				"|%-10d|%-25s|%-12d|%-15.2f"|,
				maCD,tuaCD,soBaiHat,giaThanh);
	}
}


