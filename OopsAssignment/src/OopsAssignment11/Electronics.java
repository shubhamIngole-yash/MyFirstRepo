package OopsAssignment11;

public class Electronics {

	private int id;
	private String semiConductorType;
	private String dateOfmanifacturing;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSemiConductorType() {
		return semiConductorType;
	}

	public void setSemiConductorType(String semiConductorType) {
		this.semiConductorType = semiConductorType;
	}

	public String getDateOfmanifacturing() {
		return dateOfmanifacturing;
	}

	public void setDateOfmanifacturing(String dateOfmanifacturing) {
		this.dateOfmanifacturing = dateOfmanifacturing;
	}

	@Override
	public String toString() {
		return "Electronics [id=" + id + ", semiConductorType=" + semiConductorType + ", dateOfmanifacturing="
				+ dateOfmanifacturing + "]";
	}

	public Electronics(int id, String semiConductorType, String dateOfmanifacturing) {
		super();
		this.id = id;
		this.semiConductorType = semiConductorType;
		this.dateOfmanifacturing = dateOfmanifacturing;
	}

	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

}
