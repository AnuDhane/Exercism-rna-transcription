class RnaTranscription {

    String transcribe(String dnaStrand) {
        /*throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        */
        String rnaStrand= "";
        for (char ch :dnaStrand.toCharArray() ) {
          if(ch=='G')
            rnaStrand+="C";
          else if (ch=='C') {
            rnaStrand+="G";
          }
          else if (ch=='A') {
            rnaStrand+="U";
          }
          else if(ch =='T') {
            rnaStrand+="A";
          }
        }
        return rnaStrand;
    }

}
