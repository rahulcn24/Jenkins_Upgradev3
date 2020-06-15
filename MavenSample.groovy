job('first maven project via dsl'){
	description("first maven project created via dsl")
	scm{
		git("https://github.com/rahulcn24/Jenkins_Upgradev3.git")
	}
	trigger{
		scm('* * * * *')
	}
	steps{
		maven('clean package', 'maven-samples/single-module/pom.xml')
	}
	publisher{
		archiveArtifacts '**/*.jar'
	}
}