package collections.shoppingcart; 
import java.util.List; 
import java.util.Scanner; 
    class Hello { 
        public static void main(String[] args){ 
        }
    }
    public class cat{ 
        String breed; 
        int age; 
        String color; 
        void miaow(){ 
        }
    }
    public class LampuLalulintas {
        public static void main(String[] args) {
        }
    }
    class Person {
        public String name;
        public changeName(String newName){
            this.name = newName;
        }
    }
public boolean isCorrect() {
		data = new String[4];
		for (int i = 0; i < informationLabel.length; i++) {
			if (!informationTextField[i].getText().equals(""))
				data[i] = informationTextField[i].getText();
			else
				return false;
		}
		return true;
	}

	//for setting the array of JTextField to null
	public void clearTextField() {
		for (int i = 0; i < informationTextField.length; i++)
			if (i != 2)
				informationTextField[i].setText(null);
	}
