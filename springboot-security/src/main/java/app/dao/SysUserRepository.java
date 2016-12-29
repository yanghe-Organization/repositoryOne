package app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.SysUser;
@Repository
public interface SysUserRepository extends JpaRepository<SysUser, Long>{
	SysUser findByUsername();
}
