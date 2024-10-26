package lengochieu_22003005_phonghoc;

import java.util.Objects;

public abstract class PhongHoc {
	protected String maPhong,dayNha;
	protected double dienTich;
	protected int soBongDen;
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		setDayNha(dayNha);
		setDienTich(dienTich);
		setMaPhong(maPhong);
		setSoBongDen(soBongDen);
	}
	public PhongHoc() {
		this("","",0.0,0);
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		if(maPhong == null)
			throw new IllegalArgumentException("Mã phòng không được để trống");
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		if(dayNha == null)
			throw new IllegalArgumentException("Dãy Nhà không được để trống");
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		if(dienTich<=0)
			throw new IllegalArgumentException("Diện tích phải lớn hơn 0");
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		if(soBongDen<=0)
			throw new IllegalArgumentException("Số bóng đèn phải lớn hơn 0");
		this.soBongDen = soBongDen;
	}
	
	public boolean duSang() {
		return (getDienTich()/getSoBongDen()<=10);
	}
	public abstract boolean getDatChuan();

	@Override
	public String toString() {
		String s="";
		s+= String.format("|%-10s|%-10s|%-10s|%-10s|",getMaPhong() ,getDayNha(),getDienTich(),getSoBongDen());
		return s;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	

	

}
