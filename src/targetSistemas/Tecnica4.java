package targetSistemas;

public class Tecnica4 {

	public static void main(String[] args) {
		Double SP = 67836.43, RJ = 36678.66, MG = 29229.88, ES = 27165.48, Outros = 19849.53, TOTAL;

		TOTAL = SP + RJ + MG + ES + Outros;

		double percentualSp = SP * 100 / TOTAL;
		double percentualRj = RJ * 100 / TOTAL;
		double percentualMg = MG * 100 / TOTAL;
		double percentualEs = ES * 100 / TOTAL;
		double percentualOutros = (Outros * 100) / TOTAL;

		System.out.printf("Porcentual por estado.\nSP:%.2f%%\nRJ:%.2f%%\nMG:%.2f%%\nES:%.2f%%\nOutros:%.2f%%",
				percentualSp, percentualRj, percentualMg, percentualEs, percentualOutros);

	}
}
