# Recap OOP / Remember encapsulation? #

## Opdracht 1: Maak een eenvoudige autoklasse
Maak een klasse `Car` met slechts één methode `drive(int kilometers)`. Het totaal aantal kilometers moet worden opgeslagen in
de auto voor toekomstige verwijzingen.

Bepaal wat mogelijke problemen zouden kunnen zijn met de `drive` methode met betrekking tot de _status van het object_ en geef
een oplossing voor dit probleem in je code.

Implementeer ook een `toString()` methode om de huidige _status_ van de auto weer te geven.

### Voorbeeld
Na `drive(25)`: `De auto heeft 25 km gereden.`

## Opdracht 2: Introductie van brandstof
Pas je `Car` klasse aan om het begrip `vuel` erin op te nemen. Je mag aannemen dat voor elke liter brandstof, de auto
20 kilometer kan rijden (oftewel een verhouding van 1:20). Ook hebben alle auto's een maximum aantal liters dat de tank van de auto kan bevatten (dat wordt
ingesteld via de constructor). Implementeer een `refuel(int liters)` methode om het mogelijk te maken dat de auto wordt bijgetankt.

Identificeer, net als bij opdracht 1, de mogelijke problemen met _de toestand van het object_ die deze introducties kunnen
veroorzaken en implementeer een oplossing voor deze problemen.

Werk tenslotte de `toString()` methode bij om de inhoud van de tank te tonen.

### Voorbeeld
Na `drive(20)`, met een tankinhoud van 40 liter: `De auto heeft 20 km gereden. De tank bevat momenteel 39 liter.`

## Opdracht 3: Instellen van het rendement.
Tot nu toe is het rendement ingesteld op 1:20. Uiteraard verschilt dit van auto tot auto, dus we willen in staat zijn om het
 in te stellen wanneer een auto wordt gemaakt (bijvoorbeeld via de constructor).

Zorg ervoor dat je de bovenstaande wijziging implementeert, terwijl je ervoor zorgt dat de toestand van de auto altijd geldig zal zijn.

Update je `toString()` om je geïmplementeerde verandering te laten zien.

## Opdracht 4: Een kentekenplaat toevoegen.
Het laatste onderdeel is om je auto een kenteken te geven. Vanaf 2019 heeft elk kenteken in Nederland de
vorm: "123-AB-1" (3 cijfers, 2 letters, 1 cijfer, koppelteken) en moet worden ingesteld als een nieuwe auto wordt gemaakt (constructeur).

Kentekenplaten kunnen ook gestolen of beschadigd worden, waardoor soms een vervangend nummer nodig is, dus implementeer
ook een setter voor de nummerplaat.

Merk nogmaals op waar de _status van het object_ ongeldig zou kunnen worden gemaakt en zorg ervoor dat dit niet gebeurt.

