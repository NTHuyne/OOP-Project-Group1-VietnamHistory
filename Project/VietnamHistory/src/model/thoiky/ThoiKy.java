package model.thoiky;

import java.util.ArrayList;

import model.nhanvatlichsu.Vua;

public class ThoiKy {
	private String ten;
	private String thoiGianTonTai;
	private String nguoiSangLap;
	private String quocHieu;
	private String kinhDo;
	private ArrayList<Vua> cacDoiVua = new ArrayList<Vua>();
	private String congTrinh;
	
	public ThoiKy(String ten, String thoiGianTonTai, String nguoiSangLap, String quocHieu, String kinhDo,
			ArrayList<Vua> cacDoiVua, String congTrinh) {
		super();
		this.setTen(ten);
		this.setThoiGianTonTai(thoiGianTonTai);
		this.setNguoiSangLap(nguoiSangLap);
		this.setQuocHieu(quocHieu);
		this.setKinhDo(kinhDo);
		this.setCacDoiVua(cacDoiVua);
		this.setCongTrinh(congTrinh);
	}

	public ThoiKy(String ten) {
		super();
		this.setTen(ten);
	}
	
	public ThoiKy() {
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getThoiGianTonTai() {
		return thoiGianTonTai;
	}

	public void setThoiGianTonTai(String thoiGianTonTai) {
		this.thoiGianTonTai = thoiGianTonTai;
	}

	public String getNguoiSangLap() {
		return nguoiSangLap;
	}

	public void setNguoiSangLap(String nguoiSangLap) {
		this.nguoiSangLap = nguoiSangLap;
	}

	public String getQuocHieu() {
		return quocHieu;
	}

	public void setQuocHieu(String quocHieu) {
		this.quocHieu = quocHieu;
	}

	public String getKinhDo() {
		return kinhDo;
	}

	public void setKinhDo(String kinhDo) {
		this.kinhDo = kinhDo;
	}

	public ArrayList<Vua> getCacDoiVua() {
		return cacDoiVua;
	}

	public void setCacDoiVua(ArrayList<Vua> cacDoiVua) {
		this.cacDoiVua = cacDoiVua;
	}

	public String getCongTrinh() {
		return congTrinh;
	}

	public void setCongTrinh(String congTrinh) {
		this.congTrinh = congTrinh;
	}
	
}
