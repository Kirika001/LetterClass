class Letters {
	private int idLetter;
	private int nomor;
	private String departemen;
	private String tgl;
	private String jenis;
	private String perihal;
	private String isi;
	private String lampiran;
	private String pengirim;
	private String penerima;
	
	
	public void setIdLetter(int id){
		this idLetter = id;
	}
	public void getIdLetter(){
		return idLetter;
	}

	public void setNomorSurat(int nomor){
		this nomor = nomor;
	}
	public void getNomorSurat(){
		return nomor;
	}

	public void setDepartenen(String departemen){
		this departemen = departemen;
	}
	public void getDepartenen(){
		return departemen;
	}

	public void setTanggalSurat(String tgl){
		this tgl = tgl;
	}
	public void getTanggalSurat(){
		return tgl;
	}

	public void setJenisSurat(String jenis){
		this jenis = jenis;
	}
	public void getJenisSurat(){
		return jenis;
	}

	public void setPerihalSurat(String perihal){
		this perihal = perihal;
	}
	public void getPerihalSurat(){
		return perihal;
	}

	public void setIsiSurat(String isi){
		this isi = isi;
	}
	public void getIsiSurat(){
		return isi;
	}

	public void setLampiranSurat(String lampiran){
		this lampiran = lampiran;
	}
	public void getLampiranSurat(){
		return lampiran;
	}

	public void setPengirim(String pengirim){
		this pengirim = pengirim;
	}
	public void getPengirim(){
		return pengirim;
	}

	public void setPenerima(String penerima){
		this penerima = penerima;
	}
	public void getPenerima(){
		return penerima;
	}
}

public class Letter{
	public static void main(String[] args) {
		Letters surat = new Letters();
		surat.setIdLetter(1);
		surat.setNomorSurat(1);
		surat.setDepartenen("BSKB");
		surat.setTanggalSurat("2019-01-01");
		surat.setJenisSurat("Nota dinas");
		surat.setPerihalSurat("Pembuatan selimut api");
		surat.setIsiSurat("isi surat");
		surat.setLampiranSurat("");
		surat.setPengirim("Bambang");
		surat.setPenerima("Wawan");

	}
}