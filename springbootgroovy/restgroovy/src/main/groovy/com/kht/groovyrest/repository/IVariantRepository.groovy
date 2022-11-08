package com.kht.groovyrest.repository

import com.kht.groovyrest.entity.Variant
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface IVariantRepository extends CrudRepository<Variant, Long> {

}
