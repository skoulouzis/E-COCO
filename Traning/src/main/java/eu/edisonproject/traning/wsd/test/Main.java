/*
 * Copyright 2016 S. Koulouzis.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.edisonproject.traning.wsd.test;

import eu.edisonproject.traning.utility.term.avro.Term;
import eu.edisonproject.traning.wsd.BabelNet;
import eu.edisonproject.traning.wsd.DisambiguatorImpl;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;

/**
 *
 * @author S. Koulouzis
 */
public class Main {

    public static void main(String args[]) {
        testDisambiguators();
    }

    private static void testDisambiguators() {
        try {
            Properties prop = new Properties();
            prop.setProperty("bablenet.key", "f4212b8f-161e-42cc-88a9-3d06b515c4a1");
            prop.setProperty("minimum.similarity", "0.3");
            prop.setProperty("stop.words.file", ".." + File.separator + "etc" + File.separator + "stopwords.csv");
            prop.setProperty("max.ngrams", "4");
            String itemsFilePath = ".." + File.separator + "etc" + File.separator + "dictionaryAll.csv";
            prop.setProperty("itemset.file", itemsFilePath);

            DisambiguatorImpl d = new BabelNet();
            d.configure(prop);
            Term t = d.getTerm("python");
            System.err.println(t.getGlosses());
        } catch (IOException | ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}