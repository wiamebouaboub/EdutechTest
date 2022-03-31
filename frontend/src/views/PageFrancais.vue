<template>
        <head>
        <title>EDUTECH</title>
    </head>
    <body>
        <header>
            <div class="bloc">
                <h2 class="titre2">Français</h2>                                
            </div>    
        </header>
        <section>
            <article>
                <div class="blocs1">
                    <router-link to="/PageGram" class="box1">Grammaire</router-link>
                    <router-link to="/PageLecture" class="box1">Lecture</router-link>
                </div>
                <router-view/>
                <div class="blocs1">
                    <router-link to="/PageConj" class="box1">Conjugaison</router-link>
                    <router-link to="/PageVoc" class="box1">Vocabulaire</router-link>
                </div> 
                <router-view/>               
            </article>
        </section>
    </body>
</template>

<style>

#editor{
    background-color: white;
}

.ql-toolbar{
    background-color: white;
}
</style>