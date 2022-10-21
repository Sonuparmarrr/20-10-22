package exception.assignment;

public class FileExtension {

	public static void main(String[] args) {
		String Students[]= {"Dia","Sia","Mia","Nia","Tia"};
		String files[]= {"file.java","h.pdf",""	,"Null"};
		
		String name="";
		try {			//Call in main method to check file extensions
			int i=0;
			for(String file:files) {
				int r = checkFileExtensions(file);
				if(r==1) //If a student’s submitted file ends in .java, they get 1 point or vice versa
					System.out.println("Hello " +Students[i]+ " Your file extension is .java So you get 1 point");
					else
						System.out.println("Hello " +Students[i]+ " Your file extension is not .java So you get 0 point");
					i++;
					name=Students[i];
			}
		}
		catch(NullException N) {//Null String
			System.out.println("Hello " +name+ " You submitted null  So you get -1point");
			System.err.println("NullException :"+N.getMessage());
		}
		catch(EmptyException EE) {//Empty String
			System.out.println("Hello "  +name+ " You submitted empty  So you get -1point");
			System.err.println("NullException :"+EE.getMessage());
		}
		catch(Exception e) {
		System.out.println("Your score is -1");
		System.out.println("Error :"+e.getMessage());
		}}
		public static int checkFileExtensions(String fileName)throws NullException, EmptyException{
			if(fileName==null)
				throw new NullException();
			if(fileName=="")
				throw new EmptyException();
			String file ="";
			for(int i=fileName.length()-1; i>=fileName.length()-5;i--)//Loop used for get (.java) string from filename and store file variable
			{
				if(i>0)
					file = fileName.charAt(i)+file; 
			}
			if(file.equals(".java"))
				return 1;
			
	return 0;	
		}
}

