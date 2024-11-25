
package com.Tienda.tienda.dao;
import com.Tienda.tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {    
    Usuario findByUsername(String username);
}