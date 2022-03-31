

<template>
    <body>
        <section>
            <article>
                <div class="blocs">
                        <router-link to="/PageMaths" class="box1">Mathématiques</router-link>
                        
                        <router-link to="/PageDecMond" class="box1">Découverte du monde</router-link>
                </div>
                <router-view/>  
                <div class="blocs">
                    <router-link to="/PageFrancais" class="box1">Français</router-link>
                </div>
                <router-view/>         

            </article>
        </section>
    </body>
</template>
