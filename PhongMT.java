package lengochieu_22003005_phonghoc;

public class PhongMT extends PhongHoc{
	private int soMayTinh;

	public PhongMT(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public PhongMT() {
		super();
		this.soMayTinh = 0;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	@Override
	public boolean getDatChuan() {
		return (duSang() && getDienTich()/getSoBongDen() <=1.5);
	}
	@Override
	public String toString() {
		return super.toString()+ String.format("Số máy tính: %s", getSoMayTinh());
	}
	

}
