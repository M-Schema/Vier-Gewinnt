# Vier Gewinnt

> [!NOTE]
> Studienaufgabe zu CODIH02-XX01-N01

```
„Vier gewinnt“ ist ein Brettspiel für zwei Personen. Das Spiel besteht aus einem Spielfeld 
mit 6 Zeilen und 7 Spalten sowie 42 Spielsteinen in zwei Farben. 
Alle Mitspielenden erhalten jeweils 21 Steine in der gleichen Farbe. 
Ziel des Spiels ist es, vier Steine der gleichen Farbe in einer Zeile, 
einer Spalte oder diagonal anzuordnen (siehe auch https://de.wikipedia.org/wiki/Vier_gewinnt).

Dieses Spiel sollen Sie in dieser Ausgabe als Java-Programm implementieren. 
Dazu werden die folgenden Klassen benötigt:

- Klasse GameException für Ausnahmefehler
- Klasse Token für einen Spielstein
- Klasse Player für eine Spielerin bzw. einen Spieler
- Klasse GameBoard für das Spielfeld
- abstrakte Klasse Game für das Spiel und eine davon abgeleitete Klasse ConsoleGame, 
die den Spielablauf für eine Konsolenein- und -ausgabe implementiert
- Klasse Main mit einer main-Methode für den Programmstart

Implementieren Sie diese Klassen wie folgt:

a) Die Klasse GameException wird von der API-Klasse Exception abgeleitet und besitzt 
einen Konstruktor vom Typ String, der den Grund für die Ausnahme angibt. 
Rufen Sie mit dem Parameter den Konstruktor der Oberklasse auf.

b) Die Klasse Token benötigt eine private Instanzvariable vom Typ int für die Farbe 
des Spielsteins. Legen Sie zwei öffentliche, statische Konstanten YELLOW und RED 
für die Farben der Spielsteine an. Implementieren Sie einen Konstruktor mit einem 
Parameter zum Initialisieren der Instanzvariable und eine Getter-Methode, die den Wert 
der Instanzvariable zurückgibt.

c) Die Klasse Player benötigt zwei private Instanzvariablen, einen String für den Namen 
und eine Variable vom Typ Token für die Spielsteine der Spielerin bzw. des Spielers. 
Ergänzen Sie weiterhin einen Konstruktor mit zwei Parametern vom Typ String und Token, 
der die Instanzvariablen damit initialisiert, 
sowie zwei Getter-Methoden für die beiden Variablen.

d) Die Klasse GameBoard besitzt eine private Instanzvariable für ein zweidimensionales Feld 
vom Typ Token. Legen Sie zwei öffentliche, statische Konstanten ROWS und COLS für die Anzahl 
der Zeilen und der Spalten des Spielfeldes an und erzeugen Sie damit das Spielfeld. 
Implementieren Sie dann in der Klasse die folgenden Instanzmethoden: 
Die Methode getToken besitzt zwei Parameter vom Typ int für den Zeilenindex (von 1 bis ROWS) 
und den Spaltenindex (von 1 bis COLS) und gibt den Spielstein in der Zeile und Spalte zurück. 
Ist ein Index ungültig, dann wird eine Ausnahme vom Typ GameException ausgeworfen.
Die Methode drop hat keinen Rückgabewert und erhält einen Parameter vom Typ int 
und einen Parameter vom Typ Player. Der erste Parameter gibt die Spaltennummer als Wert 
zwischen 1 und COLS an. Speichern Sie in der zugehörigen Spalte im ersten freien Platz 
einen Spielstein von der Spielerin bzw. dem Spieler im zweiten Parameter. 
Ist der Spaltenindex ungültig oder in der Spalte kein freies Feld vorhanden, 
dann soll die Methode eine Ausnahme vom Typ GameException auswerfen. 
Die Methode finished hat keine Parameter und einen Rückgabewert vom Typ boolean. 
Sie überprüft, ob eine Spielerin oder ein Spieler das Spiel gewonnen hat, 
und gibt in diesem Fall den Wert true zurück. Durchlaufen Sie dazu alle Zeilen und Spalten
 des Feldes und prüfen Sie für jede Position, ob die folgenden drei Felder die gleiche 
 Farbe haben wie das aktuelle Feld. Sie müssen dazu vier Richtungen nach oben, nach rechts, 
diagonal nach links-oben und diagonal nach rechts-oben untersuchen.

e) Die Klasse Game ist eine abstrakte Klasse. Legen Sie in der Klasse ein Feld
vom Typ Player und eine Variable vom Typ GameBoard an. Für beide Instanzvariablen 
soll ein Zugriff aus einer abgeleiteten Klasse möglich sein. 
Implementieren Sie einen Konstruktor, der zwei Strings mit den Namen der Mitspielenden 
erhält und die beiden Instanzvariablen geeignet initialisiert. Weiterhin sollen 
drei abstrakte Methoden deklariert werden. Die Methode play hat keine Parameter und 
keinen Rückgabewert, ebenso auch die Methode printBoard, die allerdings eine Exception 
vom Typ GameException auswirft. Die Methode printWinner hat keinen Rückgabewert und 
einen Parameter vom Typ Player.

f) Die Klasse ConsoleGame wird von der Klasse Game abgeleitet. Ergänzen Sie dort 
einen Konstruktor mit den gleichen Parametern wie beim Konstruktor der Oberklasse. 
Implementieren Sie dann die drei abstrakten Methoden der Oberklasse wie folgt: 
Die Methode play ist für den Spielablauf zuständig. Führen Sie hier die Spielrunden 
aus, indem Sie abwechselnd die Mitspielenden auffordern, eine Spaltennummer 
einzugeben und einen Wert von der Konsole einzulesen. Fügen Sie mithilfe der 
Methode drop einen Spielstein der Spielerin bzw. des Spielers in der Eingabespalte 
ein und zeichnen Sie anschließend das Spielfeld mithilfe der Methode printBoard. 
Fangen Sie dabei die Exceptions, die durch eine falsche Eingabe entstehen, 
auf und wiederholen Sie in diesem Fall die Konsoleneingabe. Prüfen Sie nach einer 
gültigen Eingabe mithilfe der Methode finished, ob das Spiel beendet ist, und geben 
Sie in diesem Fall die Siegerin oder den Sieger mithilfe der Methode printWinner aus. 
Falls alle Spielrunden ohne Siegerin oder Sieger durchlaufen wurden, wird zum Schluss 
die Methode printWinner mit dem Wert null ausgeführt. Die Methode printBoard gibt das 
Spielfeld auf der Konsole aus. Über und unter dem Spielfeld sollen die Spaltennummern 
von 1 bis COLS ausgegeben werden. Geben Sie dabei die gelben Spielsteine als ‚x‘ und 
die roten Spielsteine als ‚o‘ aus. Ausnahmen vom Typ GameException sollen von der 
Methode nicht gefangen werden. Die Methode printWinner erhält eine Variable vom 
Typ Player und gibt den Namen der Spielerin oder des Spielers als Gewinnerin bzw. 
Gewinner auf der Konsole aus. Ist der Parameter null, dann endet das Spiel unentschieden.

g) Die Klasse Main enthält eine main-Methode für den Programmstart. Lesen Sie in der 
main-Methode die beiden Namen der Mitspielenden ein, erzeugen Sie damit eine Instanz 
der Klasse ConsoleGame und starten Sie dann das Spiel durch den Aufruf der Methode play.
```
(Kohlmüller, N. (2022). Objektorientierte Programmierung. CODIH02, Europäische Fernhochschule Hamburg.)

Zeilenumbrüche zur besseren Lesbarkeit hinzugefügt.