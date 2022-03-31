<template>
    <body>
        <header>
            <div class="bloc">
                <h2 class="titre2">Mathématiques</h2>                                
            </div>    
        </header>
        <section>
            <article>
                <div class="blocs1">
                    <router-link to="/PageCalcul" class="box1">Calcul</router-link>
                    <router-link to="/PageNumerot" class="box1">Numérotation</router-link>
                </div>
                <router-view/>
                <div class="blocs1">
                    <router-link to="/PageGeometrie" class="box1">Géométrie</router-link>
                    <router-link to="/PageMesure" class="box1">Mesure</router-link>
                </div> 
                <router-view/>              
            </article>
        </section>
    </body>
</template>

<style>

.bloc{
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-items: center;
}

.blocs1{
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    align-items: center;
    flex-wrap: wrap;
    align-content: center;    
    height: 200px;
}
</style>