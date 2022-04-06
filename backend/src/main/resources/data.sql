-- Initialisation des tables  

INSERT INTO Matiere(matiere_intitule) VALUES
    ('Mathematiques'),
   ('Francais'),
  ('Decouverte du Monde');

INSERT INTO Chapitre(chapitre_intitule, matiere_matiere_id) VALUES
('Calcul', SELECT matiere_id FROM Matiere WHERE UPPER(matiere_intitule)='MATHEMATIQUES');

INSERT INTO Cours(cours_intitule, chapitre_chapitre_id) VALUES
('Multiplications', SELECT chapitre_id FROM Chapitre WHERE UPPER(chapitre_intitule)='CALCUL');

INSERT INTO Memory(memory_intitule, coursmemory_cours_id) VALUES
('Jeu du Memory des Multiplications', SELECT cours_id FROM Cours WHERE UPPER(cours_intitule)='MULTIPLICATIONS');

INSERT INTO PartieMemory(partiememory_valeur, memory_memory_id) VALUES
(10, SELECT memory_id FROM Memory WHERE UPPER(memory_intitule)=UPPER('Jeu du Memory des Multiplications'));

INSERT INTO TableMemory(tablememory_intitule) VALUES
('Table de 1');

INSERT INTO PaireMemory(question, reponse, tablememory_tablememory_id) VALUES
('1x1','1', SELECT TABLEMEMORY_ID FROM TABLEMEMORY WHERE UPPER(tableMemory_intitule) =UPPER('Table de 1')),
('1x2','2', SELECT TABLEMEMORY_ID FROM TABLEMEMORY WHERE UPPER(tableMemory_intitule) =UPPER('Table de 1')),
('1x3','3', SELECT TABLEMEMORY_ID FROM TABLEMEMORY WHERE UPPER(tableMemory_intitule) =UPPER('Table de 1')),
('1x4','4', SELECT TABLEMEMORY_ID FROM TABLEMEMORY WHERE UPPER(tableMemory_intitule) =UPPER('Table de 1')),
('1x5','5', SELECT TABLEMEMORY_ID FROM TABLEMEMORY WHERE UPPER(tableMemory_intitule) =UPPER('Table de 1')),
('1x6','6', SELECT TABLEMEMORY_ID FROM TABLEMEMORY WHERE UPPER(tableMemory_intitule) =UPPER('Table de 1')),
('1x7','7', SELECT TABLEMEMORY_ID FROM TABLEMEMORY WHERE UPPER(tableMemory_intitule) =UPPER('Table de 1')),
('1x8','8', SELECT TABLEMEMORY_ID FROM TABLEMEMORY WHERE UPPER(tableMemory_intitule) =UPPER('Table de 1')),
('1x9','9', SELECT TABLEMEMORY_ID FROM TABLEMEMORY WHERE UPPER(tableMemory_intitule) =UPPER('Table de 1')),
('1x10','10', SELECT TABLEMEMORY_ID FROM TABLEMEMORY WHERE UPPER(tableMemory_intitule) =UPPER('Table de 1'));

INSERT INTO User (first_name,last_name,email,password) VALUES
('nico@gmail.com','nico','aymard','nicoymd'),
('fabrice@gmail.com','fabrice','ymd','fabriceymd');

INSERT INTO Role (name) VALUES
('maitre'),
('eleve');

INSERT INTO USER_ROLE (id_user,id_role) VALUES
(SELECT USER_ID FROM USER WHERE UPPER(first_name)= UPPER('nico@gmail.com'),SELECT ROLE_ID FROM ROLE WHERE UPPER(name)= UPPER('eleve'));