class Main {
    public static void main (String[] args) {
		int a = 41;
		int b = 9;

		int aux;

		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
