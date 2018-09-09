package cn.hd.bean;

public class Login {
    private Integer id;
    private String psd;

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", psd='" + psd + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }
}
