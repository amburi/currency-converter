package com.currency.conversion.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrencySymbolRes {
    public Motd motd;
    public boolean success;
    public String base;
    public String date;
    public Rates rates;

    public Rates getRates() {
        return rates;
    }

    @Override
    public String toString() {
        return "PartnerCurrencySymbolRes{" +
                "motd=" + motd +
                ", success=" + success +
                ", base='" + base + '\'' +
                ", date='" + date + '\'' +
                ", rates=" + rates +
                '}';
    }

    public static class Rates {
        @JsonProperty("AED")
        public double aED;
        @JsonProperty("AFN")
        public double aFN;
        @JsonProperty("ALL")
        public double aLL;
        @JsonProperty("AMD")
        public double aMD;
        @JsonProperty("ANG")
        public double aNG;
        @JsonProperty("AOA")
        public double aOA;
        @JsonProperty("ARS")
        public double aRS;
        @JsonProperty("AUD")
        public double aUD;
        @JsonProperty("AWG")
        public double aWG;
        @JsonProperty("AZN")
        public double aZN;
        @JsonProperty("BAM")
        public double bAM;
        @JsonProperty("BBD")
        public double bBD;
        @JsonProperty("BDT")
        public double bDT;
        @JsonProperty("BGN")
        public double bGN;
        @JsonProperty("BHD")
        public double bHD;
        @JsonProperty("BIF")
        public double bIF;
        @JsonProperty("BMD")
        public double bMD;
        @JsonProperty("BND")
        public double bND;
        @JsonProperty("BOB")
        public double bOB;
        @JsonProperty("BRL")
        public double bRL;
        @JsonProperty("BSD")
        public double bSD;
        @JsonProperty("BTC")
        public double bTC;
        @JsonProperty("BTN")
        public double bTN;
        @JsonProperty("BWP")
        public double bWP;
        @JsonProperty("BYN")
        public double bYN;
        @JsonProperty("BZD")
        public double bZD;
        @JsonProperty("CAD")
        public double cAD;
        @JsonProperty("CDF")
        public double cDF;
        @JsonProperty("CHF")
        public double cHF;
        @JsonProperty("CLF")
        public double cLF;
        @JsonProperty("CLP")
        public double cLP;
        @JsonProperty("CNH")
        public double cNH;
        @JsonProperty("CNY")
        public double cNY;
        @JsonProperty("COP")
        public double cOP;
        @JsonProperty("CRC")
        public double cRC;
        @JsonProperty("CUC")
        public double cUC;
        @JsonProperty("CUP")
        public double cUP;
        @JsonProperty("CVE")
        public double cVE;
        @JsonProperty("CZK")
        public double cZK;
        @JsonProperty("DJF")
        public double dJF;
        @JsonProperty("DKK")
        public double dKK;
        @JsonProperty("DOP")
        public double dOP;
        @JsonProperty("DZD")
        public double dZD;
        @JsonProperty("EGP")
        public double eGP;
        @JsonProperty("ERN")
        public double eRN;
        @JsonProperty("ETB")
        public double eTB;
        @JsonProperty("EUR")
        public int eUR;
        @JsonProperty("FJD")
        public double fJD;
        @JsonProperty("FKP")
        public double fKP;
        @JsonProperty("GBP")
        public double gBP;
        @JsonProperty("GEL")
        public double gEL;
        @JsonProperty("GGP")
        public double gGP;
        @JsonProperty("GHS")
        public double gHS;
        @JsonProperty("GIP")
        public double gIP;
        @JsonProperty("GMD")
        public double gMD;
        @JsonProperty("GNF")
        public double gNF;
        @JsonProperty("GTQ")
        public double gTQ;
        @JsonProperty("GYD")
        public double gYD;
        @JsonProperty("HKD")
        public double hKD;
        @JsonProperty("HNL")
        public double hNL;
        @JsonProperty("HRK")
        public double hRK;
        @JsonProperty("HTG")
        public double hTG;
        @JsonProperty("HUF")
        public double hUF;
        @JsonProperty("IDR")
        public double iDR;
        @JsonProperty("ILS")
        public double iLS;
        @JsonProperty("IMP")
        public double iMP;
        @JsonProperty("INR")
        public double iNR;
        @JsonProperty("IQD")
        public double iQD;
        @JsonProperty("IRR")
        public double iRR;
        @JsonProperty("ISK")
        public double iSK;
        @JsonProperty("JEP")
        public double jEP;
        @JsonProperty("JMD")
        public double jMD;
        @JsonProperty("JOD")
        public double jOD;
        @JsonProperty("JPY")
        public double jPY;
        @JsonProperty("KES")
        public double kES;
        @JsonProperty("KGS")
        public double kGS;
        @JsonProperty("KHR")
        public double kHR;
        @JsonProperty("KMF")
        public double kMF;
        @JsonProperty("KPW")
        public double kPW;
        @JsonProperty("KRW")
        public double kRW;
        @JsonProperty("KWD")
        public double kWD;
        @JsonProperty("KYD")
        public double kYD;
        @JsonProperty("KZT")
        public double kZT;
        @JsonProperty("LAK")
        public double lAK;
        @JsonProperty("LBP")
        public double lBP;
        @JsonProperty("LKR")
        public double lKR;
        @JsonProperty("LRD")
        public double lRD;
        @JsonProperty("LSL")
        public double lSL;
        @JsonProperty("LYD")
        public double lYD;
        @JsonProperty("MAD")
        public double mAD;
        @JsonProperty("MDL")
        public double mDL;
        @JsonProperty("MGA")
        public double mGA;
        @JsonProperty("MKD")
        public double mKD;
        @JsonProperty("MMK")
        public double mMK;
        @JsonProperty("MNT")
        public double mNT;
        @JsonProperty("MOP")
        public double mOP;
        @JsonProperty("MRO")
        public double mRO;
        @JsonProperty("MRU")
        public double mRU;
        @JsonProperty("MUR")
        public double mUR;
        @JsonProperty("MVR")
        public double mVR;
        @JsonProperty("MWK")
        public double mWK;
        @JsonProperty("MXN")
        public double mXN;
        @JsonProperty("MYR")
        public double mYR;
        @JsonProperty("MZN")
        public double mZN;
        @JsonProperty("NAD")
        public double nAD;
        @JsonProperty("NGN")
        public double nGN;
        @JsonProperty("NIO")
        public double nIO;
        @JsonProperty("NOK")
        public double nOK;
        @JsonProperty("NPR")
        public double nPR;
        @JsonProperty("NZD")
        public double nZD;
        @JsonProperty("OMR")
        public double oMR;
        @JsonProperty("PAB")
        public double pAB;
        @JsonProperty("PEN")
        public double pEN;
        @JsonProperty("PGK")
        public double pGK;
        @JsonProperty("PHP")
        public double pHP;
        @JsonProperty("PKR")
        public double pKR;
        @JsonProperty("PLN")
        public double pLN;
        @JsonProperty("PYG")
        public double pYG;
        @JsonProperty("QAR")
        public double qAR;
        @JsonProperty("RON")
        public double rON;
        @JsonProperty("RSD")
        public double rSD;
        @JsonProperty("RUB")
        public double rUB;
        @JsonProperty("RWF")
        public double rWF;
        @JsonProperty("SAR")
        public double sAR;
        @JsonProperty("SBD")
        public double sBD;
        @JsonProperty("SCR")
        public double sCR;
        @JsonProperty("SDG")
        public double sDG;
        @JsonProperty("SEK")
        public double sEK;
        @JsonProperty("SGD")
        public double sGD;
        @JsonProperty("SHP")
        public double sHP;
        @JsonProperty("SLL")
        public double sLL;
        @JsonProperty("SOS")
        public double sOS;
        @JsonProperty("SRD")
        public double sRD;
        @JsonProperty("SSP")
        public double sSP;
        @JsonProperty("STD")
        public double sTD;
        @JsonProperty("STN")
        public double sTN;
        @JsonProperty("SVC")
        public double sVC;
        @JsonProperty("SYP")
        public double sYP;
        @JsonProperty("SZL")
        public double sZL;
        @JsonProperty("THB")
        public double tHB;
        @JsonProperty("TJS")
        public double tJS;
        @JsonProperty("TMT")
        public double tMT;
        @JsonProperty("TND")
        public double tND;
        @JsonProperty("TOP")
        public double tOP;
        @JsonProperty("TRY")
        public double tRY;
        @JsonProperty("TTD")
        public double tTD;
        @JsonProperty("TWD")
        public double tWD;
        @JsonProperty("TZS")
        public double tZS;
        @JsonProperty("UAH")
        public double uAH;
        @JsonProperty("UGX")
        public double uGX;
        @JsonProperty("USD")
        public double uSD;
        @JsonProperty("UYU")
        public double uYU;
        @JsonProperty("UZS")
        public double uZS;
        @JsonProperty("VES")
        public double vES;
        @JsonProperty("VND")
        public double vND;
        @JsonProperty("VUV")
        public double vUV;
        @JsonProperty("WST")
        public double wST;
        @JsonProperty("XAF")
        public double xAF;
        @JsonProperty("XAG")
        public double xAG;
        @JsonProperty("XAU")
        public double xAU;
        @JsonProperty("XCD")
        public double xCD;
        @JsonProperty("XDR")
        public double xDR;
        @JsonProperty("XOF")
        public double xOF;
        @JsonProperty("XPD")
        public double xPD;
        @JsonProperty("XPF")
        public double xPF;
        @JsonProperty("XPT")
        public double xPT;
        @JsonProperty("YER")
        public double yER;
        @JsonProperty("ZAR")
        public double zAR;
        @JsonProperty("ZMW")
        public double zMW;
        @JsonProperty("ZWL")
        public double zWL;

        @Override
        public String toString() {
            return "Rates{" +
                    "aED=" + aED +
                    ", aFN=" + aFN +
                    ", aLL=" + aLL +
                    ", aMD=" + aMD +
                    ", aNG=" + aNG +
                    ", aOA=" + aOA +
                    ", aRS=" + aRS +
                    ", aUD=" + aUD +
                    ", aWG=" + aWG +
                    ", aZN=" + aZN +
                    ", bAM=" + bAM +
                    ", bBD=" + bBD +
                    ", bDT=" + bDT +
                    ", bGN=" + bGN +
                    ", bHD=" + bHD +
                    ", bIF=" + bIF +
                    ", bMD=" + bMD +
                    ", bND=" + bND +
                    ", bOB=" + bOB +
                    ", bRL=" + bRL +
                    ", bSD=" + bSD +
                    ", bTC=" + bTC +
                    ", bTN=" + bTN +
                    ", bWP=" + bWP +
                    ", bYN=" + bYN +
                    ", bZD=" + bZD +
                    ", cAD=" + cAD +
                    ", cDF=" + cDF +
                    ", cHF=" + cHF +
                    ", cLF=" + cLF +
                    ", cLP=" + cLP +
                    ", cNH=" + cNH +
                    ", cNY=" + cNY +
                    ", cOP=" + cOP +
                    ", cRC=" + cRC +
                    ", cUC=" + cUC +
                    ", cUP=" + cUP +
                    ", cVE=" + cVE +
                    ", cZK=" + cZK +
                    ", dJF=" + dJF +
                    ", dKK=" + dKK +
                    ", dOP=" + dOP +
                    ", dZD=" + dZD +
                    ", eGP=" + eGP +
                    ", eRN=" + eRN +
                    ", eTB=" + eTB +
                    ", eUR=" + eUR +
                    ", fJD=" + fJD +
                    ", fKP=" + fKP +
                    ", gBP=" + gBP +
                    ", gEL=" + gEL +
                    ", gGP=" + gGP +
                    ", gHS=" + gHS +
                    ", gIP=" + gIP +
                    ", gMD=" + gMD +
                    ", gNF=" + gNF +
                    ", gTQ=" + gTQ +
                    ", gYD=" + gYD +
                    ", hKD=" + hKD +
                    ", hNL=" + hNL +
                    ", hRK=" + hRK +
                    ", hTG=" + hTG +
                    ", hUF=" + hUF +
                    ", iDR=" + iDR +
                    ", iLS=" + iLS +
                    ", iMP=" + iMP +
                    ", iNR=" + iNR +
                    ", iQD=" + iQD +
                    ", iRR=" + iRR +
                    ", iSK=" + iSK +
                    ", jEP=" + jEP +
                    ", jMD=" + jMD +
                    ", jOD=" + jOD +
                    ", jPY=" + jPY +
                    ", kES=" + kES +
                    ", kGS=" + kGS +
                    ", kHR=" + kHR +
                    ", kMF=" + kMF +
                    ", kPW=" + kPW +
                    ", kRW=" + kRW +
                    ", kWD=" + kWD +
                    ", kYD=" + kYD +
                    ", kZT=" + kZT +
                    ", lAK=" + lAK +
                    ", lBP=" + lBP +
                    ", lKR=" + lKR +
                    ", lRD=" + lRD +
                    ", lSL=" + lSL +
                    ", lYD=" + lYD +
                    ", mAD=" + mAD +
                    ", mDL=" + mDL +
                    ", mGA=" + mGA +
                    ", mKD=" + mKD +
                    ", mMK=" + mMK +
                    ", mNT=" + mNT +
                    ", mOP=" + mOP +
                    ", mRO=" + mRO +
                    ", mRU=" + mRU +
                    ", mUR=" + mUR +
                    ", mVR=" + mVR +
                    ", mWK=" + mWK +
                    ", mXN=" + mXN +
                    ", mYR=" + mYR +
                    ", mZN=" + mZN +
                    ", nAD=" + nAD +
                    ", nGN=" + nGN +
                    ", nIO=" + nIO +
                    ", nOK=" + nOK +
                    ", nPR=" + nPR +
                    ", nZD=" + nZD +
                    ", oMR=" + oMR +
                    ", pAB=" + pAB +
                    ", pEN=" + pEN +
                    ", pGK=" + pGK +
                    ", pHP=" + pHP +
                    ", pKR=" + pKR +
                    ", pLN=" + pLN +
                    ", pYG=" + pYG +
                    ", qAR=" + qAR +
                    ", rON=" + rON +
                    ", rSD=" + rSD +
                    ", rUB=" + rUB +
                    ", rWF=" + rWF +
                    ", sAR=" + sAR +
                    ", sBD=" + sBD +
                    ", sCR=" + sCR +
                    ", sDG=" + sDG +
                    ", sEK=" + sEK +
                    ", sGD=" + sGD +
                    ", sHP=" + sHP +
                    ", sLL=" + sLL +
                    ", sOS=" + sOS +
                    ", sRD=" + sRD +
                    ", sSP=" + sSP +
                    ", sTD=" + sTD +
                    ", sTN=" + sTN +
                    ", sVC=" + sVC +
                    ", sYP=" + sYP +
                    ", sZL=" + sZL +
                    ", tHB=" + tHB +
                    ", tJS=" + tJS +
                    ", tMT=" + tMT +
                    ", tND=" + tND +
                    ", tOP=" + tOP +
                    ", tRY=" + tRY +
                    ", tTD=" + tTD +
                    ", tWD=" + tWD +
                    ", tZS=" + tZS +
                    ", uAH=" + uAH +
                    ", uGX=" + uGX +
                    ", uSD=" + uSD +
                    ", uYU=" + uYU +
                    ", uZS=" + uZS +
                    ", vES=" + vES +
                    ", vND=" + vND +
                    ", vUV=" + vUV +
                    ", wST=" + wST +
                    ", xAF=" + xAF +
                    ", xAG=" + xAG +
                    ", xAU=" + xAU +
                    ", xCD=" + xCD +
                    ", xDR=" + xDR +
                    ", xOF=" + xOF +
                    ", xPD=" + xPD +
                    ", xPF=" + xPF +
                    ", xPT=" + xPT +
                    ", yER=" + yER +
                    ", zAR=" + zAR +
                    ", zMW=" + zMW +
                    ", zWL=" + zWL +
                    '}';
        }
    }

}

