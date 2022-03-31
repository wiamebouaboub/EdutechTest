<template>

    <head>
        <meta charset="UTF-8">
        <title>Edutech</title>
        <link rel="stylesheet" href="style2.css"/>
        <title>EDUTECH</title>
    </head>
    <body>
        <header>
            <div class="contenu">
                <h1 class="titre1">Calcul</h1> 
            </div>    
        </header>
        <section>
            <article>
                <div class="cours">
                    <h3>Cours</h3>
                </div>
                <div class="editCours">
                    <QuillEditor theme="snow" />
                </div>               
            </article>
            <article>
                <div class="jeu">
                    <router-link to="/MemoryPartie" class="jeuMultip"><h3>Jeu du memory des multiplication</h3></router-link>
                    <img id="jeuMem" src="../assets/icon-jeuMemory.png">                                           
                </div>
                <router-view/>

            </article>
        </section>
    </body>
</template>

<style>
.jeuMultip{
    color: black;

}
#jeuMem{
    width: 200;
    height: 200;
}

.jeu{
    width: 200;
    height: 200;
    display: flex;
    justify-content: left;
}


.editCours{
    margin: 0 0 50px 5px;
}

</style>