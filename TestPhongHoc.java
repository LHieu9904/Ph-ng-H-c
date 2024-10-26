package lengochieu_22003005_phonghoc;

import java.util.Iterator;
import java.util.List;

public class TestPhongHoc {
	public static void main(String[] args) {
		ListPhongHoc ph = new ListPhongHoc();
		
		
		ph.themPhong(new PhongLT("A01", "Day A", 100, 50, true));
		ph.themPhong(new PhongMT("H01", "Day H", 90, 60, 40));
		ph.themPhong(new PhongMT("H07", "Day H", 70, 50, 60));
		ph.themPhong(new PhongTN("B02", "Day B", 80, 35, "Hóa học", 40, true));
		
		
		
		System.out.println("Danh Sach Phòng Học: ");
		System.out.println(ph);
		
		String mp = "A01";
		System.out.println("Phòng học với mã: " + mp);
		System.out.println(ph.timPhong(mp));
		
		
		List<PhongHoc> pDC = ph.danhSachDC();
		System.out.println("Danh sách phòng đạt chuẩn: ");
		for( PhongHoc p : pDC) {
			System.out.println(p);
		}
		ph.sapXepTheoDayNha();
		System.out.println("Danh sách phòng theo dãy nhà: ");
		System.out.println(ph);
		
		ph.sapXepTheoDienTich();
		System.out.println("Danh sách phòng theo diện tích: ");
		System.out.println(ph);
		
		ph.sapXepTheoSoBongDen();
		System.out.println("Danh sách phòng theo số bóng đèn: ");
		System.out.println(ph);
	
		ph.capNhatSoMayTinh("H07", 80);
		System.out.println("Danh sách phòng sau khi cập nhật: ");
		System.out.println(ph);
		
		ph.xoaPhong("A01");
		System.out.println("Danh sách phòng sau khi xóa phòng: ");
		System.out.println(ph);
		
		System.out.println("Tổng số phòng học " + ph.tongSoPhong());
		
		
		List<PhongMT>p60 = ph.dsPhongMTCo60May();
		System.out.println("Danh sách phòng máy tính có 60 máy: ");
		for (PhongMT p : p60) {
			System.out.println(p);
		}
	}

}
