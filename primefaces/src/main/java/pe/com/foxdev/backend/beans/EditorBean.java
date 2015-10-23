package pe.com.foxdev.backend.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="editor")
@SessionScoped
public class EditorBean {
	private String value = "This editor is provided by PrimeFaces";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
