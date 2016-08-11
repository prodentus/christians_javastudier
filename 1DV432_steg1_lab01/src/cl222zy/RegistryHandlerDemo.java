package cl222zy;

public class RegistryHandlerDemo {

	public static void main(String[] args) {
		RegistryHandler registryHandler = new RegistryHandler("nameregistry.txt");
		registryHandler.introduceUser();
		registryHandler.inputTextLineAndPrintToFile();
	}

}