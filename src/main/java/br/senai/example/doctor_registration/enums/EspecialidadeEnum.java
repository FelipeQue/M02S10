package br.senai.example.doctor_registration.enums;

public enum EspecialidadeEnum {

    ALERGIAEIMUNOLOGIA ("Alergia e imunologia"),
    ANESTESIOLOGIA ("Anestesiologia"),
    ANGIOLOGIA ("Angiologia"),
    CARDIOLOGIA ("Cardiologia"),
    CIRURGIACARDIOVASCULAR ("Cirurgia cardiovascular"),
    CIRURGIADAMÃO ("Cirurgia da mão"),
    CIRURGIADECABEÇAEPESCOÇO ("Cirurgia de cabeça e pescoço"),
    CIRURGIADOAPARELHODIGESTIVO ("Cirurgia do aparelho digestivo"),
    CIRURGIAGERAL ("Cirurgia geral"),
    CIRURGIAPEDIÁTRICA ("Cirurgia pediátrica"),
    CIRURGIAPLÁSTICA ("Cirurgia plástica"),
    CIRURGIATORÁCICA ("Cirurgia torácica"),
    CIRURGIAVASCULAR ("Cirurgia vascular"),
    CLÍNICAMÉDICA ("Clínica médica"),
    COLOPROCTOLOGIA ("Coloproctologia"),
    DERMATOLOGIA ("Dermatologia"),
    ENDOCRINOLOGIA ("Endocrinologia"),
    ENDOSCOPIA ("Endoscopia"),
    GASTROENTEROLOGIA ("Gastroenterologia"),
    GENÉTICAMÉDICA ("Genética médica"),
    GERIATRIA ("Geriatria"),
    GINECOLOGIAEOBSTETRÍCIA ("Ginecologia e obstetrícia"),
    HEMATOLOGIAEHEMOTERAPIA ("Hematologia e hemoterapia"),
    HOMEOPATIA ("Homeopatia"),
    INFECTOLOGIA ("Infectologia"),
    MASTOLOGIA ("Mastologia"),
    MEDICINADEFAMÍLIAECOMUNIDADE ("Medicina de família e comunidade"),
    MEDICINADEEMERGÊNCIA ("Medicina de emergência"),
    MEDICINADOTRABALHO ("Medicina do trabalho"),
    MEDICINADOTRÁFEGO ("Medicina do tráfego"),
    MEDICINAESPORTIVA ("Medicina esportiva"),
    MEDICINAFÍSICAEREABILITAÇÃO ("Medicina física e reabilitação"),
    MEDICINAINTENSIVA ("Medicina intensiva"),
    MEDICINALEGALEPERÍCIAMÉDICA ("Medicina legal e perícia médica"),
    MEDICINANUCLEAR ("Medicina nuclear"),
    MEDICINAPREVENTIVAESOCIAL ("Medicina preventiva e social"),
    NEFROLOGIA ("Nefrologia"),
    NEUROCIRURGIA ("Neurocirurgia"),
    NEUROLOGIA ("Neurologia"),
    NUTROLOGIA ("Nutrologia"),
    OBSTETRÍCIA ("Obstetrícia"),
    OFTALMOLOGIA ("Oftalmologia"),
    ORTOPEDIAETRAUMATOLOGIA ("Ortopedia e traumatologia"),
    OTORRINOLARINGOLOGIA ("Otorrinolaringologia"),
    PATOLOGIA ("Patologia"),
    PATOLOGIACLÍNICA ("Patologia clínica/medicina laboratorial"),
    PEDIATRIA ("Pediatria"),
    PNEUMOLOGIA ("Pneumologia"),
    PSIQUIATRIA ("Psiquiatria"),
    RADIOLOGIA("Radiologia e diagnóstico por imagem"),
    RADIOTERAPIA ("Radioterapia"),
    REUMATOLOGIA ("Reumatologia"),
    TOXICOLOGIAMÉDICA ("Toxicologia médica"),
    UROLOGIA ("Urologia");

    private String especialidade;
    EspecialidadeEnum(String especialidade) {
        this.especialidade=especialidade;
    }
    public String getEspecialidade() {
        return especialidade;
    }


}
