package guis;

public class usuariosLogin {
public boolean ValidarUsuarios(String usuario,String contraseņa){
	if(usuario.equals("admin")&& contraseņa.equals("1234")){
		return true;
		}else
			return false;
}
}
