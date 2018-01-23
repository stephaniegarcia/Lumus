/* Generated By:JavaCC: Do not edit this line. Lumus.java */
public class Lumus implements LumusConstants {
        public static void main(String args []) throws ParseException
        {

                try {
                        Lumus parser;
                        boolean valid = true;

                        java.util.HashMap<String,Municipality> map = new java.util.HashMap<String,Municipality>();
                        java.util.HashMap<String,Region> map_r = new java.util.HashMap<String,Region>();
        //either read from file or console
                        if (args.length == 0) {
                                parser = new Lumus(System.in);
                        }
                        else {
                                parser = new Lumus(new java.io.FileInputStream(args[0]));
                        }

                        System.out.println("Lumus Scanner:");
                        while(valid) {
                                valid = parser.readLine(map, map_r);
                        }
                        System.out.println("\u005cnTerminating Lumus Scanner...");
                }
                catch(Throwable e) {
                        System.err.println(e.getMessage());
                }
        }

  static final public boolean readLine(java.util.HashMap map, java.util.HashMap map_r) throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TERMINATE:
      jj_consume_token(TERMINATE);
                      {if (true) return false;}
      break;
    case 0:
      jj_consume_token(0);
                  {if (true) return false;}
      break;
    case 13:
    case 16:
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
      command(map, map_r);
                                {if (true) return true;}
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public void command(java.util.HashMap map, java.util.HashMap map_r) throws ParseException {
  Token identifier=null, identifier2=null, reg=null, mun=null, sec=null, op=null, avail=null, op2=null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 13:
      jj_consume_token(13);
      identifier = jj_consume_token(ID);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[1] = jj_gen;
        ;
      }
      jj_consume_token(15);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[2] = jj_gen;
        ;
      }
      mun = jj_consume_token(NAME);
                Municipality mun2 = (Municipality)map.get(identifier.image);
                Region r3 = (Region)map_r.get(identifier.image);
                if(mun2 != null || r3 != null) {
                        System.err.println("Municipality or Region "+identifier.image+" already exists.");
                }
                else
                        map.put(identifier.image, new Municipality(mun.image));
      break;
    case 16:
      jj_consume_token(16);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[3] = jj_gen;
        ;
      }
      identifier = jj_consume_token(ID);
      jj_consume_token(17);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[4] = jj_gen;
        ;
      }
      sec = jj_consume_token(NAME);
      jj_consume_token(17);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[5] = jj_gen;
        ;
      }
      op = jj_consume_token(OPTION);
      jj_consume_token(17);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[6] = jj_gen;
        ;
      }
      avail = jj_consume_token(AVAILABILITY);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[7] = jj_gen;
        ;
      }
      jj_consume_token(18);
                Municipality temp = (Municipality)map.get(identifier.image);
                if(temp == null) {
                        System.err.println("Municipality "+identifier.image+" does not exist");
                }
                else {
                        boolean check = false;
                        if(avail.image.equals("yes"))
                                check = true;
                        else
                                check = false;
                        temp.report(sec.image,op.image,check);
                        map.put(identifier.image,temp);
                }
      break;
    case 19:
      jj_consume_token(19);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[8] = jj_gen;
        ;
      }
      identifier = jj_consume_token(ID);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[9] = jj_gen;
        ;
      }
      jj_consume_token(17);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[10] = jj_gen;
        ;
      }
      op = jj_consume_token(OPTION);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
      case 17:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 14:
          jj_consume_token(14);
          break;
        default:
          jj_la1[11] = jj_gen;
          ;
        }
        jj_consume_token(17);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 14:
          jj_consume_token(14);
          break;
        default:
          jj_la1[12] = jj_gen;
          ;
        }
        op2 = jj_consume_token(OPTION);
        break;
      default:
        jj_la1[13] = jj_gen;
        ;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[14] = jj_gen;
        ;
      }
      jj_consume_token(18);
                Municipality temp2= (Municipality)map.get(identifier.image);
                if(temp2 == null) {
                        System.err.println("Municipality "+identifier.image+" does not exist");
                }
                else {
                        if(op2 != null)
                                temp2.analyze(op.image,op2.image);
                        else
                                temp2.analyze(op.image);
                }
      break;
    case 20:
      jj_consume_token(20);
      identifier = jj_consume_token(ID);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[15] = jj_gen;
        ;
      }
      jj_consume_token(15);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[16] = jj_gen;
        ;
      }
      reg = jj_consume_token(NAME);
          Municipality m = (Municipality)map.get(identifier.image);
                Region r4 = (Region)map_r.get(identifier.image);
                if(m != null || r4 != null) {
                        System.err.println("Municipality or Region "+identifier.image+" already exists.");
                }
                else
                        map_r.put(identifier.image, new Region(reg.image));
      break;
    case 21:
      jj_consume_token(21);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[17] = jj_gen;
        ;
      }
      identifier = jj_consume_token(ID);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[18] = jj_gen;
        ;
      }
      jj_consume_token(17);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[19] = jj_gen;
        ;
      }
      identifier2 = jj_consume_token(ID);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[20] = jj_gen;
        ;
      }
      jj_consume_token(18);
                Region rtemp = (Region) map_r.get(identifier.image);
                Municipality mtemp= (Municipality)map.get(identifier2.image);

                if(rtemp == null || mtemp == null){
                        System.err.println("Municipality "+identifier2.image+ " or Region " + identifier.image + " does not exist");
                }else{
                        rtemp.addmunicipality(mtemp);
                }
      break;
    case 22:
      jj_consume_token(22);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[21] = jj_gen;
        ;
      }
      identifier = jj_consume_token(ID);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      default:
        jj_la1[22] = jj_gen;
        ;
      }
      jj_consume_token(18);
                Municipality mun3 = (Municipality)map.get(identifier.image);
                Region r2 = (Region)map_r.get(identifier.image);
                if(mun3 == null && r2 == null) {
                        System.err.println("Municipality or Region "+identifier.image+" does not exist");
                }
                else {
                        if(r2!=null)
                                r2.showStatistics();
                        else
                                mun3.showStatistics();
                }
      break;
    case 23:
      jj_consume_token(23);
        System.out.println("municipality [municipality] = [municipality name]");
        System.out.println("analyze([municipality identifier],[option])");
        System.out.println("analyze([municipality identifier],[option],[option]");
        System.out.println("report([municipality identifier],[sector name],[option],[availability])");
        System.out.println("showstatistics([municipality identifier])");
        System.out.println("region [region identifier] = [region name]");
        System.out.println("addmunicipality([region identifier], [municipality identifier])");
        System.out.println("showstatistics([region identifier])");
      break;
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public LumusTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[24];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xf92011,0x4000,0x4000,0x4000,0x4000,0x4000,0x4000,0x4000,0x4000,0x4000,0x4000,0x4000,0x4000,0x24000,0x4000,0x4000,0x4000,0x4000,0x4000,0x4000,0x4000,0x4000,0x4000,0xf92000,};
   }

  /** Constructor with InputStream. */
  public Lumus(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Lumus(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new LumusTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Lumus(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new LumusTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Lumus(LumusTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(LumusTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 24; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[24];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 24; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 24; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}