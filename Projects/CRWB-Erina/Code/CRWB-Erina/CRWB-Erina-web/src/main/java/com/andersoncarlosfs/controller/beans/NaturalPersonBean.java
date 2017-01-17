package com.andersoncarlosfs.controller.beans;

import com.andersoncarlosfs.controller.services.NaturalPersonService;
import com.andersoncarlosfs.model.AbstractController;
import com.andersoncarlosfs.model.AbstractConverter;
import com.andersoncarlosfs.model.daos.NaturalPersonDAO;
import com.andersoncarlosfs.model.entities.NaturalPerson;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Anderson Carlos Ferreira da Silva
 */
@Named
@SessionScoped
public class NaturalPersonBean extends AbstractController<NaturalPersonService, NaturalPersonDAO, NaturalPerson, java.lang.Long> {

    /**
     *
     */
    @FacesConverter(forClass = NaturalPerson.class)
    public static class NaturalPersonConverter extends AbstractConverter<NaturalPersonDAO, NaturalPerson, java.lang.Long> implements Converter {

        /**
         *
         * @throws javax.xml.bind.JAXBException
         * @param value
         * @return
         */
        @Override
        protected java.lang.Long getKey(String value) throws JAXBException {
            return new java.lang.Long(value);
        }

    }

}