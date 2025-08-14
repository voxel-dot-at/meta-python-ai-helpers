# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Industrial-strength Natural Language Processing (NLP) in Python"
HOMEPAGE = "https://spacy.io"
# NOTE: License in setup.py/PKGINFO is: MIT
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   licenses/3rd_party_licenses.txt
#   spacy/lang/hr/lemma_lookup_license.txt
# NOTE: Original package / source metadata indicates license is: MIT
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "MIT & Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=85c7d8225839af21b9a650043afb48f0 \
                    file://licenses/3rd_party_licenses.txt;md5=a54c7e6cc6b08683b7f6423f308619a2 \
                    file://spacy/lang/hr/lemma_lookup_license.txt;md5=82ff85af72be5706f10ee29353ffce4a"

SRC_URI[sha256sum] = "700fd174c6c552276be142c48e70bb53cae24c4dd86003c4432af9cb93e4c908"

inherit pypi setuptools3

# The following configs & dependencies are from setuptools extras_require.
# These dependencies are optional, hence can be controlled via PACKAGECONFIG.
# The upstream names may not correspond exactly to bitbake package names.
# The configs are might not correct, since PACKAGECONFIG does not support expressions as may used in requires.txt - they are just replaced by text.
#
# Uncomment this line to enable all the optional features.
#PACKAGECONFIG ?= "python-version-smaller-3-dot-9 python-version-bigger--equals-3-dot-9 apple cuda cuda-autodetect cuda100 cuda101 cuda102 cuda110 cuda111 cuda112 cuda113 cuda114 cuda115 cuda116 cuda117 cuda11x cuda12x cuda80 cuda90 cuda91 cuda92 ja ko lookups th transformers"
PACKAGECONFIG[python-version-smaller-3-dot-9] = ",,,python3-numpy"
PACKAGECONFIG[python-version-bigger--equals-3-dot-9] = ",,,python3-numpy"
PACKAGECONFIG[apple] = ",,,python3-thinc-apple-ops"
PACKAGECONFIG[cuda] = ",,,python3-cupy"
PACKAGECONFIG[cuda-autodetect] = ",,,python3-cupy-wheel"
PACKAGECONFIG[cuda100] = ",,,python3-cupy-cuda100"
PACKAGECONFIG[cuda101] = ",,,python3-cupy-cuda101"
PACKAGECONFIG[cuda102] = ",,,python3-cupy-cuda102"
PACKAGECONFIG[cuda110] = ",,,python3-cupy-cuda110"
PACKAGECONFIG[cuda111] = ",,,python3-cupy-cuda111"
PACKAGECONFIG[cuda112] = ",,,python3-cupy-cuda112"
PACKAGECONFIG[cuda113] = ",,,python3-cupy-cuda113"
PACKAGECONFIG[cuda114] = ",,,python3-cupy-cuda114"
PACKAGECONFIG[cuda115] = ",,,python3-cupy-cuda115"
PACKAGECONFIG[cuda116] = ",,,python3-cupy-cuda116"
PACKAGECONFIG[cuda117] = ",,,python3-cupy-cuda117"
PACKAGECONFIG[cuda11x] = ",,,python3-cupy-cuda11x"
PACKAGECONFIG[cuda12x] = ",,,python3-cupy-cuda12x"
PACKAGECONFIG[cuda80] = ",,,python3-cupy-cuda80"
PACKAGECONFIG[cuda90] = ",,,python3-cupy-cuda90"
PACKAGECONFIG[cuda91] = ",,,python3-cupy-cuda91"
PACKAGECONFIG[cuda92] = ",,,python3-cupy-cuda92"
PACKAGECONFIG[ja] = ",,,python3-sudachidict_core python3-sudachipy!"
PACKAGECONFIG[ko] = ",,,python3-natto-py"
PACKAGECONFIG[lookups] = ",,,python3-spacy_lookups_data"
PACKAGECONFIG[th] = ",,,python3-pythainlp"
PACKAGECONFIG[transformers] = ",,,python3-spacy_transformers"

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS:${PN} += "python3-catalogue python3-cymem python3-jinja2 python3-langcodes python3-murmurhash python3-packaging python3-preshed python3-pydantic python3-requests python3-setuptools python3-spacy-legacy python3-spacy-loggers python3-srsly python3-thinc python3-tqdm python3-typer python3-wasabi python3-weasel"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-click python3-compression python3-core python3-crypt python3-ctypes python3-io python3-ipython python3-jinja2 python3-json python3-logging python3-math python3-misc python3-multiprocessing python3-netclient python3-numpy python3-packaging python3-pickle python3-profile python3-requests python3-shell python3-stringold python3-typing-extensions python3-unittest"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    cPickle
#    copy_reg
#    cupy.cuda.stream
#    cupy.random
#    cymem.cymem
#    gensim.corpora.wikicorpus
#    google.colab
#    hypothesis
#    hypothesis.strategies
#    jieba
#    ml_datasets
#    mock
#    natto
#    preshed.bloom
#    pydantic
#    pydantic.main
#    pydantic.types
#    pydantic.v1
#    pydantic.v1.main
#    pydantic.v1.types
#    pymorphy2
#    pymorphy3
#    pytest
#    pythainlp.tokenize
#    pyvi
#    spacy.attrs
#    spacy.kb.candidate
#    spacy.kb.kb
#    spacy.kb.kb_in_memory
#    spacy.lexeme
#    spacy.matcher.dependencymatcher
#    spacy.matcher.levenshtein
#    spacy.matcher.matcher
#    spacy.matcher.phrasematcher
#    spacy.ml.parser_model
#    spacy.morphology
#    spacy.parts_of_speech
#    spacy.pipeline._edit_tree_internals.edit_trees
#    spacy.pipeline._parser_internals._beam_utils
#    spacy.pipeline._parser_internals.arc_eager
#    spacy.pipeline._parser_internals.ner
#    spacy.pipeline._parser_internals.nonproj
#    spacy.pipeline._parser_internals.stateclass
#    spacy.pipeline._parser_internals.transition_system
#    spacy.pipeline.dep_parser
#    spacy.pipeline.morphologizer
#    spacy.pipeline.multitask
#    spacy.pipeline.ner
#    spacy.pipeline.pipe
#    spacy.pipeline.sentencizer
#    spacy.pipeline.senter
#    spacy.pipeline.tagger
#    spacy.pipeline.trainable_pipe
#    spacy.pipeline.transition_parser
#    spacy.strings
#    spacy.symbols
#    spacy.tokenizer
#    spacy.tokens._retokenize
#    spacy.tokens.doc
#    spacy.tokens.graph
#    spacy.tokens.morphanalysis
#    spacy.tokens.span
#    spacy.tokens.span_group
#    spacy.tokens.token
#    spacy.training.align
#    spacy.training.alignment_array
#    spacy.training.example
#    spacy.training.gold_io
#    spacy.vectors
#    spacy.vocab
#    spacy_pkuseg
#    sudachipy
#    thinc.api
#    thinc.backends
#    thinc.backends.cupy_ops
#    thinc.compat
#    thinc.config
#    thinc.initializers
#    thinc.layers
#    thinc.layers.chain
#    thinc.layers.resizable
#    thinc.loss
#    thinc.model
#    thinc.tests.strategies
#    thinc.types
#    thinc.util
#    torch
#    typer.main
#    typer.testing
#    wasabi.tables
#    weasel.cli.assets
#    weasel.cli.clone
#    weasel.cli.document
#    weasel.cli.dvc
#    weasel.cli.pull
#    weasel.cli.push
#    weasel.cli.remote_storage
#    weasel.cli.run
#    wheel

PYPI_PACKAGE = "spacy"
