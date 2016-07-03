/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.edisonproject.traning.wsd;

import eu.edisonproject.traning.utility.term.avro.Term;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.json.simple.parser.ParseException;

/**
 *
 * @author S. Koulouzis
 */
public interface Disambiguator {

    public List<Term> disambiguateTerms(String filterredDictionary) throws IOException,ParseException;

    public void configure(Properties properties);

    public Term getTerm(String term) throws IOException, ParseException;
}
