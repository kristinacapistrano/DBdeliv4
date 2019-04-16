In order to run this program here are the steps
Eclipse (preferred):
1. Load DDL, DML scripts into your localhost mysql. Make sure jdbc:mysql://localhost:3306/Mojo?user=<youruser> is what your connection info looks like.
2. Import the project as new project.
3. Make sure all libraries in lib folder are added.
4. go to run configurations and in arguments put <username> <password> as the arguments.
5. Right click MojoTransportMain.java and click run as java application.

Else:
1. Load up previous scripts into your localhost mysql. Make sure jdbc:mysql://localhost:3306/Mojo?user=<youruser> is what your connection info looks like.
2. There are 2 command line parameters for MojoTransportMain, they are your username and password
3. The GUI has 3 functionalities which are self explanatory.
Some good test paramaters are "honda" for textfield 1 and "Seadoo Spark1" for textfield 2.