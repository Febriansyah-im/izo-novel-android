package com.sata.izonovel.Model;

public class ListNovelResponseModel {
    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    private Document document;

    public static class Document{
        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getJudul() {
            return judul;
        }

        public void setJudul(String judul) {
            this.judul = judul;
        }

        public String getManusia() {
            return manusia;
        }

        public void setManusia(String manusia) {
            this.manusia = manusia;
        }

        public String getPenerbit() {
            return penerbit;
        }

        public void setPenerbit(String penerbit) {
            this.penerbit = penerbit;
        }

        public String getPengarang() {
            return pengarang;
        }

        public void setPengarang(String pengarang) {
            this.pengarang = pengarang;
        }

        public String getSinopsis() {
            return sinopsis;
        }

        public void setSinopsis(String sinopsis) {
            this.sinopsis = sinopsis;
        }

        public String getTahunTerbit() {
            return tahunTerbit;
        }

        public void setTahunTerbit(String tahunTerbit) {
            this.tahunTerbit = tahunTerbit;
        }

        private String _id;
        private String genre;
        private String judul;
        private String manusia;
        private String penerbit;
        private String pengarang;
        private String sinopsis;
        private String tahunTerbit;
    }
}
