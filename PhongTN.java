package lengochieu_22003005_phonghoc;

public class PhongTN extends PhongHoc{
	private String chuyenNganh;
	private int sucChua;
	private boolean coBonChua;
	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
			boolean coBonChua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonChua = coBonChua;
	}
	public PhongTN() {
		super();
		this.chuyenNganh = "";
		this.sucChua = 0;
		this.coBonChua = false;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public boolean isCoBonChua() {
		return coBonChua;
	}
	public void setCoBonChua(boolean coBonChua) {
		this.coBonChua = coBonChua;
	}
	@Override
	public boolean getDatChuan() {
		return (duSang() && coBonChua);
	}
	@Override
	public String toString() {
		String bonRua = coBonChua? " có bồn rửa ":"Không có bồn rửa ";
		return super.toString()+ String.format("Chuyên ngành: %s; Sức Chứa: %s; %s", getChuyenNganh(),getSucChua(), bonRua);
	}
	
	

}
