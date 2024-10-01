import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();

        try {
            System.out.print("Insira o nome do usuário: ");
            String nome = scanner.nextLine();
            usuario.setNome(nome);

            System.out.print("Insira a idade do usuário: ");
            int idade = scanner.nextInt();
            usuario.setIdade(idade);

            System.out.println("Cadastro realizado com sucesso!");
            System.out.println(usuario);

        } catch (NomeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
