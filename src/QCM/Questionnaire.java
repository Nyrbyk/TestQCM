/**
 * 
 */
package QCM;

/**
 * @author pascal
 *
 */
public class Questionnaire {

	private String Name;
	public Questionnaire(String QCMName) {
		Name = QCMName;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
