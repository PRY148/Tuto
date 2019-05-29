<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_No. de das perdidos     Nm</name>
   <tag></tag>
   <elementGuidId>42adb87c-c3ba-4f16-947c-9d0e35c18136</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>box-body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
            
 No. de días perdidos
 
  
  Número de días de incapacidad otorgados al afectado
  
 
            
 El accidente ocurrió realizando su oficio habitual
  No  Si
  
  
  
 
            
            
 Fecha de la investigación
 

2024
2023
2022
2021
2020
2019
2018
2017
2016
2015
2014
2013
2012
2011
2010
2009
2008
2007
2006
2005
2004
2003
2002
2001
2000
1999
1998
1997
1996
1995
1994
1993
1992
1991
1990
1989
1988
1987
1986
1985
1984
1983
1982
1981
1980
1979
1978
1977
1976
1975
1974
1973
1972
1971
1970
1969
1968
1967
1966
1965
1964
1963
1962
1961
1960
1959
1958
1957
1956
1955
1954
1953
1952
1951
1950
1949
1948
1947
1946
1945
1944
1943
1942
1941
1940
1939
 

01
02
03
04
05
06
07
08
09
10
11
12
 

01
02
03
04
05
06
07
08
09
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31

  $(function() {
      function wfd_accident_base_research_date_time_read_linked() {
        $(&quot;#accident_base_research_date_time_jquery_control&quot;).val($(&quot;#accident_base_research_date_time_year&quot;).val() + &quot;-&quot; + $(&quot;#accident_base_research_date_time_month&quot;).val() + &quot;-&quot; + $(&quot;#accident_base_research_date_time_day&quot;).val());
    
        return {};
      }
    
      function wfd_accident_base_research_date_time_update_linked(date) {
        $(&quot;#accident_base_research_date_time_year&quot;).val(parseInt(date.substring(0, 4), 10));
        $(&quot;#accident_base_research_date_time_month&quot;).val(parseInt(date.substring(5, 7), 10));
        $(&quot;#accident_base_research_date_time_day&quot;).val(parseInt(date.substring(8), 10));
        $(&quot;#accident_base_research_date_time_day&quot;).trigger(&quot;change&quot;);
    
        wfd_accident_base_research_date_time_check_linked_days();
      }
    
      function wfd_accident_base_research_date_time_check_linked_days() {
        var daysInMonth = 32 - new Date($(&quot;#accident_base_research_date_time_year&quot;).val(), $(&quot;#accident_base_research_date_time_month&quot;).val() - 1, 32).getDate();
    
        $(&quot;#accident_base_research_date_time_day option&quot;).removeAttr(&quot;disabled&quot;);
        $(&quot;#accident_base_research_date_time_day option:gt(&quot; + (daysInMonth) +&quot;)&quot;).attr(&quot;disabled&quot;, &quot;disabled&quot;);
    
        if ($(&quot;#accident_base_research_date_time_day&quot;).val() > daysInMonth) {
          $(&quot;#accident_base_research_date_time_day&quot;).val(daysInMonth);
        }
      }

    $(&quot;#accident_base_research_date_time_jquery_control&quot;).datepicker($.extend({}, {
      minDate:    new Date(1939, 1 - 1, 1),
      maxDate:    new Date(2024, 12 - 1, 31),
      beforeShow: wfd_accident_base_research_date_time_read_linked,
      onSelect:   wfd_accident_base_research_date_time_update_linked,
      showOn:     &quot;button&quot;,
      buttonText: &quot;&quot;,
      changeMonth: true,
	  changeYear: true
      
    }, $.datepicker.regional[&quot;es&quot;], {}, {dateFormat: &quot;yy-mm-dd&quot;}));
    
    wfd_accident_base_research_date_time_check_linked_days();
    
    $(&quot;#accident_base_research_date_time_day, #accident_base_research_date_time_month, #accident_base_research_date_time_year&quot;).change(wfd_accident_base_research_date_time_check_linked_days);
  });
 

00
01
02
03
04
05
06
07
08
09
10
11
12
13
14
15
16
17
18
19
20
21
22
23
 h 

00
01
02
03
04
05
06
07
08
09
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
 m
  
  
  
 
            
 Empleado fue enviado
  No  Si
  
  
  
 
            
 Descripción del accidente
    5W2H5 Porqué'spDÓNDE: &lt;br/>&lt;br/>
CUÁNDO: &lt;br/>&lt;br/>
QUÉ: &lt;br/>&lt;br/>
CÓMO: &lt;br/>

  
  
  
 
            
 Tratamiento inicial
 
  
  
  
 
            
 Observaciones del trabajador y/o testigos
 
  
  
  
 
            
            
 Testigo del evento 1
 
  
  
  
 
            
 Observaciones
 
  
  
  
 
            
 Testigo del evento 2
 
  
  
  
 
            
 Observaciones
 
  
  
  
 
            
 Severidad
  Grave  Leve  Seria
  
  
  
 
            
 Probabilidad
  Frecuentemente  Ocasionalmente  Raro
  
  
  
 
            
 Mecanismos de lesión
 
...Otros
Accidente de transito
Atrapado por/entre/debajo de
Atropellado por
Caida de diferente nivel
Caida del mismo nivel
Contacto con energia Electrica
Contacto con objet/sust. calientes
Contacto con Objetos/Sustancias
Contacto con Radiaciones
Exposicion a Calor
Golpeado con
Golpeado por
Inhalacion/Absorcion/Deglucion
Mordido/Picado por
Perforado/Cortado/Raspado
Proyeccion de Fragmentos Liquidos
Proyeccion de Fragmentos Solidos
Sobreesfuerzo
Seleccionar todos | Deseleccionar todos | Invertir
  
  
  
 
            
 Agentes de la lesión
 
...Otros
Articulos de metal
Cajas/Canecas/Envases
Calor Radiante
Derivados del Petroleo
Edificios/Equipos/Estructuras
Equipos de Izaje
Equipos Electricos
Escaleras/Andamios
Herramientas manuales con motor
Herramientas manuales sin motor
Llamas/Fuego/Humos
Madera
Material de Construccion
Material Particulado
Microbios/Animales/Plantas
Movimientos del Cuerpo
Muebles/Accesorios de Trabajo
Papel/Carton
Seleccionar todos | Deseleccionar todos | Invertir
  
  
  
 
            
                                                                                      
                
                  
 Parte del cuerpo
 

Abdomen
Antebrazo Derecho
Antebrazo Izquierdo
Boca
Brazo Derecho
Brazo Izquierdo
Cadera
Cara
Codo Derecho
Codo Izquierdo
Craneo
Cuello
Dedos de pie Derecho
Dedos de pie Izquierdo
Dedos Mano Derecha
Dedos Mano Izquierda
Dientes
Genitales
Glúteos
Hombro Derecho
Hombro Izquierdo
Lesiones multiples
Mano Derecha
Mano Izquierda
Maxilar
Muñeca Derecha
Muñeca Izquierda
Muslo Derecho
Muslo Izquierdo
Nariz
Oido
Ojo Derecho
Ojo Izquierdo
Oreja Derecha
Oreja Izquierda
Organos Internos
Pie Derecho
Pie Izquierdo
Pierna Derecha
Pierna Izquierda
Rodilla Derecha
Rodilla Izquierda
Tobillo Derecho
Tobillo Izquierdo
Torax Anterior (pecho)
Torax Posterior (Espalda)

  
  
  
 
                
                
                  
 Tipo de lesión
 

Amputacion/Enucleacion
Asfixia
Cuerpo extraño incluido
Efecto Radiacion no ionizante
Esguince
Espasmo Muscular/Desgarre
Fractura
Herida
Intoxicación
Luxación
Politraumatismo
Quemadura Calorica
Quemadura Electrica
Quemadura Quimica
Reacción alergica
Sin lesion aparente
Trauma Craneoencefalico
Traumatismo/Golpe

  
  
  
 
                
                              
            
            
              
                Agregar lesión
              
            
          </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;tq_form&quot;)/div[@class=&quot;row&quot;]/div[@class=&quot;col-sm-12 col-md-12&quot;]/div[@class=&quot;box box-skin box-solid&quot;]/div[@class=&quot;box-body&quot;]</value>
   </webElementProperties>
</WebElementEntity>
