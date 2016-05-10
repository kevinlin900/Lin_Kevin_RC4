
public class transmit implements RC4Definition {
<<<<<<< HEAD
	private int S[] = new int[256];
	private int K[] = new int [256];
	public static void main(String[] args) {

	}

	public void SInitialize() {

	}

	public byte [] encrypt(int[] plaintext){
	int j =0;
	int temp = 0;
	for (int i = 0; i<255; i++){
		S[i] = i;
		K[i] = key[i % key.length];
		j = j+S[i] + K[i%1];
		temp = S[i];
		S[i] = S[j];
		S[j] = temp;
	}

	public void PRGA() {
	
	}

	public void PrintResult() {

=======

	}
}
