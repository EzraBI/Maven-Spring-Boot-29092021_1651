//package net.office_planner.Admin;
//
//import net.office_planner.User.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//
//public class CustomAdminDetails implements AdminDetails {
//
//	private Admin admin;
//
//	public CustomAdminDetails(User user) {
//		this.admin = admin;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return null;
//	}
//
//	@Override
//	public String getPassword() {
//
//		return admin.getPassword();
//	}
//
//	@Override
//	public String getUsername() {
//		return admin.getEmail();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
//
//	public String getFullName() {
//		return admin.getFirstName() + " " + admin.getLastName();
//	}
//
//}
